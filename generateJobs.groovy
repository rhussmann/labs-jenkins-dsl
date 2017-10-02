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
  triggers {
    githubPush()
  }
  wrappers {
    colorizeOutput()
  }
}

pipelineJob('beta.rickyandjodi.com') {
  definition {
    cpsScm {
      scm {
	git {
	  remote {
	    credentials('ssh.beta.rickyandjodi.com')
	    url('git@github.com:rhussmann/rickyandjodi.com.git')
	  }
	}
      }
      scriptPath('jenkins-hooks/Jenkinsfile')
    }
  }
  triggers {
    githubPush()
  }
  wrappers {
    colorizeOutput()
  }
}

pipelineJob('release-form-ui') {
  definition {
    cpsScm {
      scm {
	git {
	  remote {
	    credentials('release-form-ui')
	    url('git@github.com:rhussmann/release-form-ui.git')
	  }
	}
      }
      scriptPath('jenkins-hooks/Jenkinsfile')
    }
  }
  triggers {
    githubPush()
  }
  wrappers {
    colorizeOutput()
  }
}
