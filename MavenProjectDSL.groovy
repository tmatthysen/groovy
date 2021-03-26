job('First-Maven-Project-Via-DSL'){
	description(First Maven Project Generated by DSL on ${new Date()})
	scm{
		git("https://github.com/tmatthysen/maven-samples.git", main)
	}
	triggers{
		scm('* * * * *')
	}
	step{
		maven('clean package', 'single-module/pom.xml')
	}
	publishers{
		archiveArtifacts '**/*.jar'
	}
}