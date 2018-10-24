var gulp = require("gulp"),
    sass = require("gulp-sass");

var webapp = "src/main/webapp/"
var resources = "src/main/resources/"

gulp.task("default", [
    "generate-templates",
    "generate-styles",
    "generate-images",
]);

gulp.task("generate-templates", function() {
    return gulp.src(webapp + "**/*.html")
               .pipe(gulp.dest(resources + "templates/"))
});

gulp.task("generate-styles", function() {
    return gulp.src(webapp + "sass/**/*.sass")
               .pipe(sass().on("error", sass.logError))
               .pipe(gulp.dest(resources + "static/css/"))
});

gulp.task("generate-images", function() {
    return gulp.src(webapp  + "images/**/*")
               .pipe(gulp.dest(resources + "static/images/"))
});
