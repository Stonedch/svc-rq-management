var gulp = require("gulp"),
    sass = require("gulp-sass");

gulp.task("default", [
    "generate-styles",
]);

gulp.task("generate-styles", function() {
    return gulp.src("app/sass/**/*.sass")
               .pipe(sass().on("error", sass.logError))
               .pipe(gulp.dest("app/css/"))
});
