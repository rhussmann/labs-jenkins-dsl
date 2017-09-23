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
  wrappers {
    colorizeOutput()
  }
}
