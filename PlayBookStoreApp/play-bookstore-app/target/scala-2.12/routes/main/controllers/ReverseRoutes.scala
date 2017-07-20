
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/conf/routes
// @DATE:Thu Jul 20 00:52:27 BST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseBookController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/edit/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:12
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:14
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:22
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/delete/" + implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:20
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:18
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/edit/")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def welcome(name:String, lastName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "welcome/" + implicitly[play.api.mvc.PathBindable[String]].unbind("name", play.core.routing.dynamicString(name)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("lastName", play.core.routing.dynamicString(lastName)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
