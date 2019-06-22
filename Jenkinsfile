pipeline {
  agent any
  stages {
    stage('Code quality') {
      parallel {
        stage('Lint') {
          steps {
            timeout(time: 20, activity: true) {
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
        environment {
          TTTT = 'key'
        }
        steps {
          echo 'running build script on Release'
        }
    }
    stage('Tests') {
          steps {
            echo 'Running unit tests'
            echo 'Running integration tests'
          }
    }
  }
  environment {
    ESHOME = 'path'
  }
}
