using NUnit.Framework;
using Applitools.Images;
using Applitools.Utils.Geometry;

namespace Applitools.Images.Tests
{
[TestFixture]
[Parallelizable]
public class CheckImageUrlInPngFormatClass : TestSetupGenerated
{

    [SetUp]
    public void SetUpTest()
    {
      InitEyes("master");
      
    }
    
    [TearDown]
    public void TearDownTest()
    {
      Runner.GetAllTestResults(false);
      Eyes?.Abort();
    }

    [Test]
    [Category("Generated")] 
    public void CheckImageUrlInPngFormat()
    {
      Eyes.Open("Eyes Images SDK", "CheckImageUrl", new RectangleSize(700, 460));
      Eyes.Check(Target.Url("https://raw.githubusercontent.com/applitools/sdk.coverage.tests/universal-sdk/fixtures/images/house.jpeg"));
      Eyes.Close(true);
    }
  }
}
