pipelineJob('lists.rhussmann.com') {
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
