pipeline {
agent { label 'slaveNode1' }

```
tools {
    maven 'Maven'
}

stages {

    stage('Build') {
        steps {
            bat 'mvn clean package'
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
```

}
