## Metals test environment variable repro

I have the following configurations set in my metals config:
```lua
dap.configurations.scala = {
  {
    type = 'scala',
    request = 'launch',
    name = 'RunOrTest',
    metals = {
      runType = 'runOrTestFile',
      env = { FOO = 'BAR' },
    },
  }
}
```

