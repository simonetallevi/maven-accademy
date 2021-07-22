#5-lib-installation

Here an example of installation of a library in a local and remote database

##project local installation

    mvn install

##third party lib local installation

    mvn install:install-file \
    -Dfile=<path-to-file> \
    -DgroupId=<group-id> -DartifactId=<artifact-id> \
    -Dversion=<version> -Dpackaging=<packaging>

##remote repo installation

    mvn deploy:deploy-file -DgroupId=<group-id> \
    -DartifactId=<artifact-id> \
    -Dversion=<version> \
    -Dpackaging=<type-of-packaging> \
    -Dfile=<path-to-file> \
    -DrepositoryId=<id-to-map-on-server-section-of-settings.xml> \
    -Durl=<url-of-the-repository-to-deploy>