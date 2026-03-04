pipeline {
agent { label 'slaveNode1' }

tools {
    maven 'Maven'
}

stages {

    stage('Build') {
        steps {
            dir('Javarepo1') {
                bat 'mvn clean package'
            }
        }
    }

}
}
