
package views.html.Home

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>My Welcome Page</title>
	</head>
	<body>
		<p>Welcome """),_display_(/*8.15*/name),format.raw/*8.19*/(""" """),_display_(/*8.21*/lastName),format.raw/*8.29*/(""" """),format.raw/*8.30*/("""To our Website </p>
	</body>

</html>

"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 19 23:53:43 BST 2017
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/Home/welcome.scala.html
                  HASH: ee8881d6be78185c69dd5b4f40f3702af55c9946
                  MATRIX: 962->1|1089->33|1119->37|1229->121|1253->125|1281->127|1309->135|1337->136
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|40->8|40->8
                  -- GENERATED --
              */
          