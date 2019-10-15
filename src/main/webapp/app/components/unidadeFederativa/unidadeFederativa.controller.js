class UnidadeFederativaController {
  constructor(UnidadeFederativaService) {
    this.unidadeFederativaService = UnidadeFederativaService;
  }
  $onInit() {
    this.newUnidadeFederativa = {
      title: '',
      selected: false
    };
    this.unidadeFederativas = [];
    this.unidadeFederativaService.getUnidadeFederativas().then(response => {
      console.log(response);
      this.unidadeFederativas = response
    });
  }
  $onChanges(changes) {
    if (changes.unidadeFederativaData) {
      this.unidadeFederativas = Object.assign({}, this.unidadeFederativaData);
    }
  }
  addUnidadeFederativa({ unidadeFederativa }) {
    if (!unidadeFederativa) return;
    this.unidadeFederativas.unshift(unidadeFederativa);
    console.log(this.unidadeFederativas);
    this.newUnidadeFederativa = {
      title: '',
      selected: false
    };
  }
}

UnidadeFederativaController.$inject = ['UnidadeFederativaService'];

export default UnidadeFederativaController;