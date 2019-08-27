<div class="container">
    <div class="row">
        <div class="col">

        </div>
        <div class="col align-self-center">
            <form action="PlatoAdmin" method="post">
                <input type="hidden" name="accion" value="REGISTRAR" />
                <div class="form-group">
                    <label>Plato</label>
                    <input type="text" class="form-control" placeholder="Ingrese Nombre de Plato" name="nombre" value="<%= p.getNombre() %>">
                </div>
                <div class="form-group">
                    <label>Precio</label>
                    <input type="number" class="form-control" placeholder="Precio" name="precio" value="<%= p.getPrecio() %>">
                </div>
                <button type="submit" class="btn btn-primary btn-block"><i class="fas fa-save"></i> Actualizar</button>
            </form>
        </div>
        <div class="col">
        </div>
    </div>
</div>