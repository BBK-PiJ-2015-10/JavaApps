
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/conf/routes
// @DATE:Thu Jul 20 00:52:27 BST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
