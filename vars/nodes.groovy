class nodes implements Serializable {
  private List<String> nodeList = new ArrayList<String>()

  nodes() {
    Jenkins.instance.nodes.each { node ->
      this.nodeList.add(node.name)
    }
  }

  List<String> getNodes() {
    return this.nodeList
  }

  boolean nodeExists(String name) {
    return this.nodeList.contains(name)
  }
}
