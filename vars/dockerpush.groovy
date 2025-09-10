def call(String project, String imageTag) {
    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
        sh """
            docker login -u ${dockerhubuser} -p ${dockerhubpass}
            docker push ${dockerhubuser}/${project}:${imageTag}
        """
    }
}
