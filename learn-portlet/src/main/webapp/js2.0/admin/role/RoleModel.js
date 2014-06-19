RoleService = new Backbone.Service({ url: Utils.getContextPath,
  sync: {
    'update': {
      'path': function (model) {
        return 'api/roles/' + model.id + '?action=UPDATE&permission=' + model.get('permission') +
          '&isDefault=' + model.get('isDefault');
      },
      'method': 'post'
    },
    'delete': {
      'path': function (model) {
        return 'api/roles/' + model.id + '?action=DELETE&liferayRoleID=' + model.get('liferayRoleId') +
          '&permission=' + model.get('permission');
      },
      'method': 'post'
    }
  }
})


RoleModel = Backbone.Model.extend({
  defaults: {
    name: '',
    description: '',
    liferayRoleId: '',
    permission: '',
    isDefault: false
  }
}).extend(RoleService);

Permissions = {'Teacher': 'teacher', 'Student': 'student'}
