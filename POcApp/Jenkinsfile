pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean compile' 
            }
        }
		stage('package') { 
            steps {
                sh 'mvn package' 
            }
        }
    }
}