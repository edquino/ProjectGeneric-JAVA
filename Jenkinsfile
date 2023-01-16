pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Build') {
      steps {
        echo 'hello projectGeneric-JAVA'
      }
    }
    stage ('cat README'){
	when{
	  branch develop	 
	}
	steps {
	  sh '''
	    cat README.md
	  '''
	}
    }
  }
}
