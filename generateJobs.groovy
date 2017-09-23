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
    cpsScm {
      scm {
	git {
	  remote {
	    credentials('ssh-lists.rhussmann.com')
	    url('git@github.com:rhussmann/christmas-lists.git')
	  }
	}
      }
      scriptPath('jenkins-hooks/Jenkinsfile')
    }
  }
  wrappers {
    colorizeOutput()
  }
}




