const UnidadeFederativaListComponent = {
  bindings: {
    unidadeFederativas: '<',
  },
  template: `
    <pre>{{$ctrl.unidadeFederativas|json}}</pre>
  `
};

export default UnidadeFederativaListComponent;