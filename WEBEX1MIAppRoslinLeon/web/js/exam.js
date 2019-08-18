/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#nivelSelect1').on('change', function () {
        console.log('ingresa aqui');
        var value = $(this).val();
        console.log(value);

        if (value === 'n2') {
            console.log('ingresa 1');

            $("#nivel1").css('display', 'none');
            $("#nivel2").css('display', '');
            $('#nv2').click();

        }
        if (value === 'n1') {
            console.log('ingresa 2');

            $("#nivel2").css('display', 'none');
            $("#nivel1").css('display', '');
            $('#nv1').click();
        }

    });
});


function multiplos() {
    let m = Number(document.getElementById('multiplo').value);
    let inicio = Number(document.getElementById('inicio').value);
    let f = Number(document.getElementById('fin').value);
    let result = '';

    for (let i = inicio; i <= f; i++) {
        if (i % m === 0) {
            result += i + ', ';
        }

    }
    $("#resultado").val(result);
}


function mostrarPlatos() {
    $('#cartaid').css('display','');
}






