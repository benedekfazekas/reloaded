# reloaded

A Leiningen 2 template to generate project skeletons using
[tools.namespace] and a `:dev` profile in an [uberrepl](https://github.com/benedekfazekas/uberrepl) compliant way.

This template is based on the blog article [My Clojure Workflow, Reloaded].

[tools.namespace]: https://github.com/clojure/tools.namespace
[My Clojure Workflow, Reloaded]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded

* uberrepl

Strictly speaking this template is just a variation of Stuart Sierra's reloaded template. The rationale behind it that if this template is used on multiple projects then those projects are easily handled by the [uberrepl](https://github.com/benedekfazekas/uberrepl) therefore you can easily create a REPL which contains all of these projects and enables the developer to batch reload, restart, stop them.

## Releases and Dependency Information

This template requires [Leiningen] 2.

I publish releases to [Clojars].

Current release is 0.1.0

No installation is necessary; Leiningen should automatically discover
and download the template.

[Leiningen]: http://leiningen.org/
[Clojars]: http://clojars.org/


## Usage

Run `lein new reloaded com.example/new-project` to generate a new
project skeleton in the `new-project` directory, with a structure like
this:

    .
    ├── README.md
    ├── epl-v10.html
    ├── project.clj
    ├── dev
    │   └── user.clj
    │   └── project_repl
    │       └── new_project.clj
    └── src
        └── com
            └── example
                └── new_project.clj

The `dev` directory contains files that you will use only during
interactive development, including `user.clj` which is automatically
loaded by Clojure at startup. The `user.clj` simply delegates everything
to a dedicated project repl namespace.

The `src` directory contains your application source files.

See the [article] for an explanation of how I use these files to
develop an application.

[article]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php
