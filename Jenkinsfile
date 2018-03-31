pipeline {
    agent any
    tools{
    maven 'MAVEN'
    jdk 'JDK8'    
    }
    stages {
        stage('Build') {
            steps {
               echo 'This is a minimal pipeline.'
                echo "M2_HOME = %M2_HOME% "
            }
        }
    }
}
