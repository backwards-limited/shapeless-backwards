# Setup

Apologies I shall only cover **Mac** - One day I may include Linux and Windows.

Install [Homebrew](https://brew.sh) for easy package management on Mac:

```bash
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Required installations:

```bash
$ brew cask install java
$ brew install jenv
$ brew install scala
$ brew install sbt
```

Other essentials (though optional):

```bash
$ brew install curl
$ brew install httpie
```

These install the necessary Java and Scala environment, where [jenv](http://www.jenv.be) manages said environment.

To configure our JVM environment:

```bash
$ jenv versions
    system
  * 12.0.1
```

From the available versions, let's set the latest:

```bash
$ jenv local 12.0.1
```