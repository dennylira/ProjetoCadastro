package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/header.jspf");
    _jspx_dependants.add("/WEB-INF/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head><script>(function(){(function(){function e(a){this.t = {}; this.tick = function(a, c, b){this.t[a] = [void 0 != b?b:(new Date).getTime(), c]; if (void 0 == b)try{window.console.timeStamp(\"CSI/\" + a)} catch (h){}}; this.tick(\"start\", null, a)}var a; window.performance && (a = window.performance.timing); var f = a?new e(a.responseStart):new e; window.mobilespeed_jstiming = {Timer:e, load:f}; if (a){var c = a.navigationStart, d = a.responseStart; 0 < c && d >= c && (window.mobilespeed_jstiming.srt = d - c)}if (a){var b = window.mobilespeed_jstiming.load; 0 < c && d >= c && (b.tick(\"_wtsrt\",\n");
      out.write("                void 0, c), b.tick(\"wtsrt_\", \"_wtsrt\", d), b.tick(\"tbsd_\", \"wtsrt_\"))}try{a = null, window.chrome && window.chrome.csi && (a = Math.floor(window.chrome.csi().pageT), b && 0 < c && (b.tick(\"_tbnd\", void 0, window.chrome.csi().startE), b.tick(\"tbnd_\", \"_tbnd\", c))), null == a && window.gtbExternal && (a = window.gtbExternal.pageT()), null == a && window.external && (a = window.external.pageT, b && 0 < c && (b.tick(\"_tbnd\", void 0, window.external.startE), b.tick(\"tbnd_\", \"_tbnd\", c))), a && (window.mobilespeed_jstiming.pt = a)} catch (g){}})(); })();</script>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"Cadastro\">\n");
      out.write("        <meta name=\"author\" content=\"Fabricio\">\n");
      out.write("\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/flat/css/flat-ui.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Static navbar -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">Home</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("                        <li><a href=\"cliente.jsp\">Cadastro de clientes</a></li>\n");
      out.write("                        <li><a href=\"fornecedor.jsp\">Cadastro de fornecedores</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">");
      out.write("\n");
      out.write("<h1>Cadastro Cliente</h1>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"campo-1\">Nome </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"text\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("                <label for=\"campo-1\">Cpf </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"text\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("                <label for=\"campo-1\">RG </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"text\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("                <label for=\"campo-1\">Email </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"email\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("                <label for=\"campo-1\">Telefone </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"text\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("                <label for=\"campo-1\">Endereço </label>\n");
      out.write("                <!-- Se quiserem diminuir o tamanho do input usem style='width: 150px' -->\n");
      out.write("                <input style='width: 80%' type=\"text\" class=\"form-control\" placeholder=\"Descreva o campo\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary\" value=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>(function(){var d = \"webkitvisibilitychange\", g = \"_ns\"; if (window.mobilespeed_jstiming){window.mobilespeed_jstiming.a = {}; window.mobilespeed_jstiming.b = 1; var n = function(b, a, e){var c = b.t[a], f = b.t.start; if (c && (f || e))return c = b.t[a][0], void 0 != e?f = e:f = f[0], Math.round(c - f)}, p = function(b, a, e){var c = \"\"; window.mobilespeed_jstiming.srt && (c += \"&srt=\" + window.mobilespeed_jstiming.srt, delete window.mobilespeed_jstiming.srt); window.mobilespeed_jstiming.pt && (c += \"&tbsrt=\" + window.mobilespeed_jstiming.pt, delete window.mobilespeed_jstiming.pt); try{window.external && window.external.tran?\n");
      out.write("                c += \"&tran=\" + window.external.tran:window.gtbExternal && window.gtbExternal.tran?c += \"&tran=\" + window.gtbExternal.tran():window.chrome && window.chrome.csi && (c += \"&tran=\" + window.chrome.csi().tran)} catch (v){}var f = window.chrome; if (f && (f = f.loadTimes)){f().wasFetchedViaSpdy && (c += \"&p=s\"); if (f().wasNpnNegotiated){var c = c + \"&npn=1\", h = f().npnNegotiatedProtocol; h && (c += \"&npnv=\" + (encodeURIComponent || escape)(h))}f().wasAlternateProtocolAvailable && (c += \"&apa=1\")}var l = b.t, t = l.start, f = [], h = [], k; for (k in l)if (\"start\" != k &&\n");
      out.write("                0 != k.indexOf(\"_\")){var m = l[k][1]; m?l[m] && h.push(k + \".\" + n(b, k, l[m][0])):t && f.push(k + \".\" + n(b, k))}delete l.start; if (a)for (var q in a)c += \"&\" + q + \"=\" + a[q]; (a = e) || (a = \"https:\" == document.location.protocol?\"https://csi.gstatic.com/csi\":\"http://csi.gstatic.com/csi\"); return[a, \"?v=3\", \"&s=\" + (window.mobilespeed_jstiming.sn || \"mobilespeed\") + \"&action=\", b.name, h.length?\"&it=\" + h.join(\",\"):\"\", c, \"&rt=\", f.join(\",\")].join(\"\")}, r = function(b, a, e){b = p(b, a, e); if (!b)return\"\"; a = new Image; var c = window.mobilespeed_jstiming.b++; window.mobilespeed_jstiming.a[c] =\n");
      out.write("                a; a.onload = a.onerror = function(){window.mobilespeed_jstiming && delete window.mobilespeed_jstiming.a[c]}; a.src = b; a = null; return b}; window.mobilespeed_jstiming.report = function(b, a, e){if (\"prerender\" == document.webkitVisibilityState){var c = !1, f = function(){if (!c){a?a.prerender = \"1\":a = {prerender:\"1\"}; var h; \"prerender\" == document.webkitVisibilityState?h = !1:(r(b, a, e), h = !0); h && (c = !0, document.removeEventListener(d, f, !1))}}; document.addEventListener(d, f, !1); return\"\"}return r(b, a, e)}; var u = function(b, a, e, c){return 0 <\n");
      out.write("                e?(c?b.tick(a, c, e):b.tick(a, \"\", e), !0):!1}; window.mobilespeed_jstiming.getNavTiming = function(b){if (window.performance && window.performance.timing){var a = window.performance.timing; u(b, \"_dns\", a.domainLookupStart) && u(b, \"dns_\", a.domainLookupEnd, \"_dns\"); u(b, \"_con\", a.connectStart) && u(b, \"con_\", a.connectEnd, \"_con\"); u(b, \"_req\", a.requestStart) && u(b, \"req_\", a.responseStart, \"_req\"); u(b, \"_rcv\", a.responseStart) && u(b, \"rcv_\", a.responseEnd, \"_rcv\"); if (u(b, g, a.navigationStart)){u(b, \"ntsrt_\", a.responseStart, g); u(b, \"nsfs_\",\n");
      out.write("                a.fetchStart, g); u(b, \"nsrs_\", a.redirectStart, g); u(b, \"nsre_\", a.redirectEnd, g); u(b, \"nsds_\", a.domainLookupStart, g); u(b, \"nscs_\", a.connectStart, g); u(b, \"nsrqs_\", a.requestStart, g); var e = !1; try{e = window.external && window.external.startE} catch (c){}!e && window.chrome && window.chrome.csi && (e = Math.floor(window.chrome.csi().startE)); e && (u(b, \"_se\", e), u(b, \"sens_\", a.navigationStart, \"_se\")); u(b, \"ntplt0_\", a.loadEventStart, g); u(b, \"ntplt1_\", a.loadEventEnd, g); window.chrome && window.chrome.loadTimes && (a = window.chrome.loadTimes().firstPaintTime) &&\n");
      out.write("                u(b, \"nsfp_\", 1E3 * a, g)}}}}; })();</script><script>(function(){var a = window.mobilespeed_jstiming, b = a.load; window.top == window && window.addEventListener(\"load\", function(){b.name = \"load\"; b.tick(\"ol\"); a.getNavTiming(b); setTimeout(function(){a.report(b, {e:\"preload_critical_resources\"})}, 300)}, !1); })();\n");
      out.write("        </script>\n");
      out.write("        <script src=\"css/flat/js/flat-ui.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
