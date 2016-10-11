<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglibs/taglibs.jsp"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Hello React!</title>
    <script src="${ctx}/assets/js/react-15.3.1/build/react.js"></script>
    <script src="${ctx}/assets/js/react-15.3.1/build/react-dom.js"></script>
  </head>
  <body>
    <div id="container"></div>
    <script>
      var ExampleApplication = React.createClass({
        render: function() {
          var elapsed = Math.round(this.props.elapsed  / 100);
          var seconds = elapsed / 10 + (elapsed % 10 ? '' : '.0' );
          var message =
            'React has been successfully running for ' + seconds + ' seconds.';

          return React.DOM.p(null, message);
        }
      });

      // Call React.createFactory instead of directly call ExampleApplication({...}) in React.render
      var ExampleApplicationFactory = React.createFactory(ExampleApplication);

      var start = new Date().getTime();
      setInterval(function() {
        ReactDOM.render(
          ExampleApplicationFactory({elapsed: new Date().getTime() - start}),
          document.getElementById('container')
        );
      }, 50);
      </script>
  </body>
</html>
