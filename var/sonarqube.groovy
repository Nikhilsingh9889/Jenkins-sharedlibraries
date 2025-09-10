def call(){
withSonarQubeEnv("${SonarQubeAPI}"){
sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectkey=${ProjectKey} -x"
}
}
