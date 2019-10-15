class UnidadeFederativaFormController {
  constructor(EventEmitter) {
      this.EventEmitter = EventEmitter;
  }
  $onChanges(changes) {
    if (changes.unidadeFederativa) {
      this.unidadeFederativa = Object.assign({}, this.unidadeFederativa);
    }
  }
  onSubmit() {
    if (!this.unidadeFederativa.title) return;
    // with EventEmitter wrapper
    this.onAddUnidadeFederativa(
      this.EventEmitter({
        unidadeFederativa: this.unidadeFederativa
      })
    );
    // without EventEmitter wrapper
    /*this.onAddUnidadeFederativa({
      $event: {
        unidadeFederativa: this.unidadeFederativa
      }
    });*/
  }
}

UnidadeFederativaFormController.$inject = ['EventEmitter'];

export default UnidadeFederativaFormController;