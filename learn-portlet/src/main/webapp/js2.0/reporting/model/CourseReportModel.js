var CourseReportTargets = {
    load: {
        path: function (model) {
            var url = path.api.report + "?action=COURSE";
            if(jQuery1816Report('.select-scope').val() == 'instance')
                url+="&scope=instance";
            else
                url+="&courseId="+jQuery1816Report('#courseID').val();
            return url;
        },
        method:'GET'
    }
};

CourseReportService = new Backbone.Service({ url: '/',targets: CourseReportTargets});

var CourseReportModel = Backbone.Model.extend({
    defaults: {
    }
}).extend(CourseReportService);