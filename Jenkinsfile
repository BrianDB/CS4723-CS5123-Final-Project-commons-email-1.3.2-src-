pipeline {
  agent any
  stages {
    stage('Build Stage') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test Stage') {
      steps {
        sh 'mvn test'
      }
    }

  }
}