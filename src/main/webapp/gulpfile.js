var gulp = require("gulp"),
    sass = require("gulp-sass");

gulp.task("default", [
    "generate-templates",
    "generate-styles",
    "generate-images",
]);

gulp.task("generate-templates", function() {
    return gulp.src("app/**/*.html")
               .pipe(gulp.dest("../resources/templates/"))
});

gulp.task("generate-styles", function() {
    return gulp.src("app/sass/**/*.sass")
               .pipe(sass().on("error", sass.logError))
               .pipe(gulp.dest("../resources/static/css/"))
});

gulp.task('generate-images', function() {
    return gulp.src('app/images/**/*')
               .pipe(gulp.dest('../resources/static/images/'))
});
