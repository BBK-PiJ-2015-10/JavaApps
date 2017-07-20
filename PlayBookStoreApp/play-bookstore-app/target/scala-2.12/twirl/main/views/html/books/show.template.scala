
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book: Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("@book.getTitle")/*5.26*/{_display_(Seq[Any](format.raw/*5.27*/("""
	"""),format.raw/*6.2*/("""<h2>"""),_display_(/*6.7*/book/*6.11*/.getTitle),format.raw/*6.20*/("""</h2>
	<p>Price : """),_display_(/*7.14*/book/*7.18*/.getPrice),format.raw/*7.27*/("""</p>
	<p>Author :"""),_display_(/*8.14*/book/*8.18*/.getAuthor),format.raw/*8.28*/("""</p>
	
	<a href=""""),_display_(/*10.12*/routes/*10.18*/.BookController.edit(book.getId)),format.raw/*10.50*/("""">Edit</a>
	<a href=""""),_display_(/*11.12*/routes/*11.18*/.BookController.destroy(book.getId)),format.raw/*11.53*/("""">Delete</a>
""")))}),format.raw/*12.2*/("""



"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:25:17 BST 2017
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/books/show.scala.html
                  HASH: 8b1c2ba78a90f8742c31bf4ecde6ada2f0c0eba9
                  MATRIX: 951->1|1036->18|1081->13|1111->35|1139->38|1171->62|1209->63|1238->66|1268->71|1280->75|1309->84|1355->104|1367->108|1396->117|1441->136|1453->140|1483->150|1530->170|1545->176|1598->208|1648->231|1663->237|1719->272|1764->287
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|44->12
                  -- GENERATED --
              */
          