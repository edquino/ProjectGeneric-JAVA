pipeline {
  agent {label 'master'}
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Build') {
      steps {
        echo 'hello projectGeneric-JAVA'
      }
    }
  }
}
