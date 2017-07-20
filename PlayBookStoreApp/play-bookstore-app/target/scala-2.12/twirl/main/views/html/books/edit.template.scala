
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("Edit Book")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
	"""),format.raw/*6.2*/("""<h1>Edit Book</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = routes.BookController.update())/*7.55*/{_display_(Seq[Any](format.raw/*7.56*/("""
		"""),_display_(/*8.4*/helper/*8.10*/.inputText(bookForm("id"))),format.raw/*8.36*/("""
		"""),_display_(/*9.4*/helper/*9.10*/.inputText(bookForm("title"))),format.raw/*9.39*/("""
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(bookForm("price"))),format.raw/*10.39*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(bookForm("author"))),format.raw/*11.40*/("""
		
		"""),format.raw/*13.3*/("""<input type="submit" value="Edit Book"/>
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
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/books/edit.scala.html
                  HASH: 5ca63f3d5f90f23b78472ad8455849b8bf0fc9a0
                  MATRIX: 957->1|1053->29|1098->24|1128->46|1156->49|1183->68|1221->69|1250->72|1297->94|1310->100|1364->146|1402->147|1432->152|1446->158|1492->184|1522->189|1536->195|1585->224|1616->229|1631->235|1681->264|1712->269|1727->275|1778->305|1813->313|1887->357|1920->360
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|45->13|46->14|47->15
                  -- GENERATED --
              */
          