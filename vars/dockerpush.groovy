def call(){
  withcredential([usernamePassword(credentialsId: 'dockerHub' , passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
                  }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
                  }
