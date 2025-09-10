def call(String Project, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
    // safer docker login
    sh "echo ${dockerhubpass} | docker login -u ${dockerhubuser} --password-stdin"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
