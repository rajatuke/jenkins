pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "helo world"
            }
        }
        stage('Test') { 
            steps {
                sh "ls"
            }
        }
        stage('Deploy') { 
            steps {
                echo "succesfully build"
            }
        }
    }
}