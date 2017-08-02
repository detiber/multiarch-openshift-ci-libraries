class nodes implements Serializable {
  private List<String> nodes = new ArrayList<String>()

  nodes() {
    nodes = new List<String>()
    Jenkins.instance.nodes.each { node ->
      nodes.append(node.name)
    }
    this.nodes = nodes
  }

  List<String> getNodes() {
    return this.nodes
  }

  boolean nodeExists(String name) {
    return this.nodes.contains(name)
  }
}
