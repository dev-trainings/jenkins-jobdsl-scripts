job('hystrix-dashboard-private') {
    scm {
        git {
            branch '*/master'
            remote {
                credentials 'bitbucket'
                url "https://bitbucket.org/dev-trainings/jobdsl-hystrix-dashboard.git"
            }
        }
    }
    steps {
        maven 'install'
    }
    wrappers {
        timestamps()
    }
}
