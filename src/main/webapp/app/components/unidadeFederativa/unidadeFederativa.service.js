class UnidadeFederativaService {
  constructor($q) {
    this.$q = $q;
  }
  getUnidadeFederativas() {
    return this.$q.when([{
      title: 'Default',
      selected: false
    }]);
  }
}

UnidadeFederativaService.$inject = ['$q'];

export default UnidadeFederativaService;