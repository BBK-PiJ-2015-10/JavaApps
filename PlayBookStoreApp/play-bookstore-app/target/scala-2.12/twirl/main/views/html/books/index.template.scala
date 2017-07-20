
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/layout("All Books")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
	"""),format.raw/*4.2*/("""<h1>All Books</h1>	
	"""),_display_(/*5.3*/for(book <- books) yield /*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
		"""),format.raw/*6.3*/("""<a href=""""),_display_(/*6.13*/routes/*6.19*/.BookController.show(book.getId)),format.raw/*6.51*/("""">Title: """),_display_(/*6.61*/book/*6.65*/.getTitle),format.raw/*6.74*/("""</a>
		<p>Price : """),_display_(/*7.15*/book/*7.19*/.getPrice),format.raw/*7.28*/("""</p>
		<p>Author : """),_display_(/*8.16*/book/*8.20*/.getAuthor),format.raw/*8.30*/("""</p>		
	""")))}),format.raw/*9.3*/("""	
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.BookController.create()),format.raw/*10.42*/("""">Create Book</a>
""")))}),format.raw/*11.2*/("""



"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 22:44:29 BST 2017
                  SOURCE: C:/Users/yasse/JavaApps/PlayBookStoreApp/play-bookstore-app/app/views/books/index.scala.html
                  HASH: 79e7f21ada1289d177f4d3423a4c70f3dbe49988
                  MATRIX: 958->1|1073->21|1103->26|1130->45|1168->46|1197->49|1245->72|1278->90|1316->91|1346->95|1382->105|1396->111|1448->143|1484->153|1496->157|1525->166|1571->186|1583->190|1612->199|1659->220|1671->224|1701->234|1740->244|1771->248|1808->258|1823->264|1868->288|1918->308
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|42->10|43->11
                  -- GENERATED --
              */
          