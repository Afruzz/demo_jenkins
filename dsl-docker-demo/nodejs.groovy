job('NodeJS example') {
    scm {
        git('https://github.com/wardviaene/docker-demo.git') {  node -> 
            node / gitConfigName('DSL Docker Demo')
            node / gitConfigEmail('dsl-docker-demo@madeupemailaddress.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
