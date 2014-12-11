var RevealJSModel = LessonContentModel.extend({
  defaults: {
    contentType: 'questionRevealJS',
    title: '',
    text: ''
  }
});

var RevealJSView = Backbone.View.extend({
  template: $('#revealJSViewTemplate').html(),
  render: function () {
    this.isNew = this.model.isNew();
    var mustacheAccumulator = {};
    _.extend(mustacheAccumulator, this.model.toJSON(), GLOBAL_translations);

    this.$el.html(Mustache.render(this.template, mustacheAccumulator));

    if (this.isNew) {
      var uploaderPath = path.root + path.api.files + '?action=ADD&contentType=reveal&quizID=' + this.model.get('lessonId');
      if (this.model.get('categoryId')) uploaderPath += '&categoryID=' + this.model.get('categoryId');

      var uploader = new FileUploader({
        endpoint:  uploaderPath
      });
      uploader.on('itemDone', function(response) {
        this.model.set({
          id: response.id,
          title: this.$('.title-edit').val()
        });
        if (this.cancelled) {
          this.model.destroy();
        } else {
          this.model.save();
        }
      }.bind(this));

      this.$('.file-uploader').append(uploader.render().$el);
    }

    return this;
  },
  preview: function () {
    this.$('.content').attr('src', this.$('.url-edit').val());
  },
  submit: function () {
    this.model.set({
      title: this.$('.title-edit').val() ||  'New presentation'
    });
    this.model.save();
    contentManagerEvent.trigger('question:added', this.model);
  },
  cancel: function() {
    this.cancelled = true;
    if (this.isNew) {
      this.model.destroy();
    }
  }
});

var RevealJSModal = Backbone.Modal.extend({
  template: _.template(Mustache.render($('#modal-template').html(), _.extend({header: GLOBAL_translations['addPresentationLabel']}, GLOBAL_translations))),
  submitEl: '.modal-submit',
  cancelEl: '.close-button',
  className: 'add-presentation-modal',
  onRender: function () {
    this.view = new RevealJSView({
      model: this.model,
      el: this.$('.content')
    });
    this.view.render();
  },
  submit: function () {
    if (this.view)
      this.view.submit();
  },
  cancel: function() {
    if (this.view)
      this.view.cancel();
  }
});