$(function () {
    $("#frmClienteNombre").bind("submit", function () {
        return Create();
    });
    function Create() {
        $.ajax({
            url: 'clientenombre.do',
            type: 'POST',
            data: {
                NomCom: $("#txtNombreCompleto").val()
            },
            success: function (responseText) {
            }
        });
    }
    List();
    function List() {
        $.ajax({
            url: 'clientenombre.do',
            data: {},
            type: 'GET',
            dataType: 'json',
            success: function (respJson) {
                $("#tblListNombre").html("");
                $("#tblListNombre").html(
                        "<thead>" +
                        "<tr>" +
                        "<th>Nombres</th>" +
                        "<th>Apellidos</th>" +
                        "</tr>" +
                        "</thead>" +
                        "<tbody>" +
                        "</tbody>"
                        );
                for (var i in respJson) {
                    var nombrecompleto = respJson[i];
                    $("#tblListNombre tbody").append(
                            "<tr>" +
                            "<td>" + nombrecompleto.Nombre + "</td>" +
                            "<td>" + nombrecompleto.Apellido + "</td>" +
                            "</tr>"
                            );
                }
            }
        });
    }
});