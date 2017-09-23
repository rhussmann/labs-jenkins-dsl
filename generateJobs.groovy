pipelineJob('lists.rhussmann.com') {
  scm {
    git {
      remote {
	credentials('ssh-lists.rhussmann.com')
	url('git@github.com:trevormcleod/reading-app-api.git')
      }
    }
  }
  definition {
    cps {
      script(readFileFromWorkspace('jenkins-hooks/Jenkinsfile'))
      sandbox()
    }
  }
}
