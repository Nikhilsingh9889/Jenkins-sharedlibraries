def call(){
  withcredential([credentialsId: 'dockerHub' , passwordVariable: 'docariable: 'dockerhubuser')]) {
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
                  }
    sh "docker push ${dockerhubuser}/${Project}:ag}"
                  }
