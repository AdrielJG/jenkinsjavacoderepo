pipeline {
agent { label 'slaveNode1' }

tools {
    maven 'Maven'
    jdk 'JDK17'
}

stages {

    stage('Checkout Code') {
        steps {
            git 'https://github.com/AdrielJG/jenkinsjavacoderepo'
        }
    }

    stage('Build') {
        steps {
            sh 'mvn clean compile'
        }
    }

    stage('Test') {
        steps {
            sh 'mvn test'
        }
    }

    stage('Package') {
        steps {
            sh 'mvn clean package'
        }
    }

}

post {
    success {
        echo 'Build Successful'
    }
    failure {
        echo 'Build Failed'
    }
}

}
