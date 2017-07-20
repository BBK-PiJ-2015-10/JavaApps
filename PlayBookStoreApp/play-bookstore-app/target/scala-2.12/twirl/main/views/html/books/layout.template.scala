
package views.html.books

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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
	<head>
		<title>"""),_display_(/*7.11*/title),format.raw/*7.16*/("""</title>
	</head>
	<body>
		"""),_display_(/*10.4*/body),format.raw/*10.8*/("""
	"""),format.raw/*11.2*/("""</body>

</html>



"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:20:17 BST 2017
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/books/layout.scala.html
                  HASH: c072a080f4bc4ee913ef966da24d60e3a3787fec
                  MATRIX: 960->1|1061->34|1106->29|1136->51|1164->53|1217->80|1242->85|1300->117|1324->121|1354->124
                  LINES: 28->1|31->3|34->1|36->4|37->5|39->7|39->7|42->10|42->10|43->11
                  -- GENERATED --
              */
          