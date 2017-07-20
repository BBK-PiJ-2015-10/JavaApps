
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("Create Book")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
	"""),format.raw/*6.2*/("""<h1>Create Book</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = routes.BookController.save())/*7.53*/{_display_(Seq[Any](format.raw/*7.54*/("""
		"""),_display_(/*8.4*/helper/*8.10*/.inputText(bookForm("id"))),format.raw/*8.36*/("""
		"""),_display_(/*9.4*/helper/*9.10*/.inputText(bookForm("title"))),format.raw/*9.39*/("""
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(bookForm("price"))),format.raw/*10.39*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(bookForm("author"))),format.raw/*11.40*/("""
		
		"""),format.raw/*13.3*/("""<input type="submit" value="Create Book"/>
	""")))}),format.raw/*14.3*/("""
""")))}),format.raw/*15.2*/("""



"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:25:17 BST 2017
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/books/create.scala.html
                  HASH: 2c3ca24a90ace432ab9aae4fe82b27dc3ee2faeb
                  MATRIX: 959->1|1055->29|1100->24|1130->46|1158->49|1187->70|1225->71|1254->74|1303->98|1316->104|1368->148|1406->149|1436->154|1450->160|1496->186|1526->191|1540->197|1589->226|1620->231|1635->237|1685->266|1716->271|1731->277|1782->307|1817->315|1893->361|1926->364
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14|47->15
                  -- GENERATED --
              */
          