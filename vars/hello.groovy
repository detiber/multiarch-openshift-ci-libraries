//class hello implements Serializable {
//  def world() {
//    echo "Hello World!"
//  }
//}

class hello implements Serializable {
    private String name
    def setName(value) {
        name = value
    }
    def getName() {
        name
    }
    def greeting() {
        echo "Hello, ${name}!"
    }
}
