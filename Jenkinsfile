pipeline {
  agent any
  stages {
    stage('Intro') {
      parallel {
        stage('Intro') {
          steps {
            timeout(time: 20, activity: true) {
              sh 'echo "why am i here"'
              dir(path: 'myinnerdir') {
                sleep 10
                echo 'I\'m here'
              }

            }

          }
        }
        stage('Middle') {
          steps {
            echo 'retry'
          }
        }
      }
    }
    stage('1') {
      parallel {
        stage('1') {
          environment {
            TTTT = 'key'
          }
          steps {
            sh 'ls'
          }
        }
        stage('2') {
          environment {
            PPP = 'value'
          }
          steps {
            sh 'pwd'
          }
        }
      }
    }
  }
  environment {
    ESHOME = 'path'
  }
}