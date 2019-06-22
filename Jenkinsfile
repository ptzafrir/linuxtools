pipeline {
  agent any
  stages {
    stage('Code quality') {
      parallel {
        stage('Lint') {
          steps {
            timeoutdd(time: 20, activity: true) {
              dir(path: 'myinnerdir') {
                echo 'Running lint and checkpatch'
              }
            }
          }
        }
        stage('Static Analysis') {
          steps {
            echo 'running cppcheck'
          }
        }
      }
    }
    stage('Build') {
        stage('build') {
          environment {
            TTTT = 'key'
          }
          steps {
            echo 'running build script on Release'
          }
        }
    }
    stage('Tests') {
	stage('unit tests') {
          steps {
            echo 'Running unit tests'
          }
	}
	stage('integration tests') {
          steps {
            echo 'Running integration tests'
          }
	}
    }
  }
  environment {
    ESHOME = 'path'
  }
}
